import sys
from sklearn import svm
import numpy as np

isIce  = sys.argv[1]
isRain = sys.argv[2]
isWind = sys.argv[3]
isDry  = sys.argv[4]
isSnow = sys.argv[5]
isCold = sys.argv[6]

param1 = sys.argv[7]
param2 = sys.argv[8]
param3 = sys.argv[9]
param4 = sys.argv[10]
param5 = sys.argv[11]

f = open("processed_weather2.csv", "r")

X = []
y = []

for line in f.readlines():
    line = line.split(",")
    factors = []
    if isIce:
        factors.append(line[0])
    if isRain:
        factors.append(line[1])
    if isWind:
        factors.append(line[2])
    if isDry:
        factors.append(line[3])
    if isSnow:
        factors.append(line[4])
    if isCold:
        factors.append(line[5])

    y.append(float(line[6])

for i in range(len(X)):
    for j in range(len(X[i])):
        try:
            X[i][j] = float(X[i][j])
        except:
            print(i)

clf = svm.SVC()
clf.fit(X, y)

print(clf.predict([[param1, param2, param3, param4, param5]]))

f.close()