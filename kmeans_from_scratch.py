import matplotlib.pyplot as plt
from matplotlib import style
style.use('ggplot')
import numpy as np
from sklearn.cluster import KMeans

X = np.array([[1,2],
              [1.5,1.8],
              [5,8],
              [8,8],
              [1,0.6],
              [9,11]])

colors = 10*["g","r","c","b","k"]
#print(colors)
#plt.scatter(X[:,0], X[:,1], s=150, marker='x', c='b')
class K_Means:
    def __init__(self, k=2,tol=0.001,max_iter=300):
        self.k = k
        self.tol = tol
        self.max_iter = max_iter

    def fit(self, data):
        self.centroids = {}
        for i in range(self.k):
            self.centroids[i] = data[i]

        for i in range(self.max_iter):
            self.classifications = {}

            for j in range(self.k):
                self.classifications[j] = []

            for featureset in X:
                distances = []
                for k in range(self.k):
                    distances.append(np.linalg.norm(featureset-self.centroids[k]))
                classification = distances.index(min(distances))
                self.classifications[classification].append(featureset)

            prev_centroids = dict(self.centroids)

            for classification in self.classifications:
                self.centroids[classification] = np.average(self.classifications[classification],axis=0)
            optimized = True
            for c in self.centroids:
                original_centroid = prev_centroids[c]
                current_centroid = self.centroids[c]
                if np.sum((current_centroid-original_centroid)/original_centroid*100.0) > self.tol:
                    print("iter times",i) 
                    optimized = False
                    break
            if optimized:
                break


    def predict(self, data):
        distances = []
        for j in range(self.k):
            distances.append(np.linalg.norm(data - self.centroids[j]))
        classification = distances.index(min(distances))
        return classification

clf = K_Means()
clf.fit(X)
#print(clf.centroids[0])
#print(clf.centroids[1])

# centroids data
for centroids in clf.centroids:
    plt.scatter(clf.centroids[centroids][0],clf.centroids[centroids][1], marker="o", c="k", s=150)

# original data
for classification in clf.classifications:
    color = colors[classification]
    for featureset in clf.classifications[classification]:
        plt.scatter(featureset[0],featureset[1], marker="x", color=color, s=150, linewidths=5)

# prediction data
unknowns = np.array([[1,3],
                     [8,9],
                     [0,3],
                     [5,4],
                     [6,4],])

for unknown in unknowns:
    classification = clf.predict(unknown)
    #print(classification)
    plt.scatter(unknown[0], unknown[1], marker='*',color=colors[classification], s=150, linewidths=5)

plt.show()
