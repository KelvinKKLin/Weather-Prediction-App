import sys
from sklearn import svm
import numpy as np

#Read arguments from the command line
isIce  = sys.argv[1]
isRain = sys.argv[2]
isWind = sys.argv[3]
isDry  = sys.argv[4]
isSnow = sys.argv[5]
isCold = sys.argv[6]

param0 = sys.argv[7]
param1 = sys.argv[8]
param2 = sys.argv[9]
param3 = sys.argv[10]
param4 = sys.argv[11]
param5 = sys.argv[12]

#Open the data file
f = open("weather_data.csv", "r")

X = []
y = []
params = []

#Read the data file and store the desired attributes and labels into
#X and y.
lines = f.readlines()
for i in range(1, len(lines)):
    line = lines[i].split(",")
    factors = []
    if isIce:
        factors.append(float(line[0]))
    if isRain:
        factors.append(float(line[1]))
    if isWind:
        factors.append(float(line[2]))
    if isDry:
        factors.append(float(line[3]))
    if isSnow:
        factors.append(float(line[4]))
    if isCold:
        factors.append(float(line[5]))

    X.append(factors)
    y.append(float(line[6]))

#Create and train the SVM
clf = svm.SVC()
clf.fit(X, y)

#Determine which parameters to feed to the SVM
if isIce:
    params.append(param0)
if isRain:
    params.append(param1)
if isWind:
    params.append(param2)
if isDry:
    params.append(param3)
if isSnow:
    params.append(param4)
if isCold:
    params.append(param5)

#Use the SVM to generate a prediction, and print it to the console
print(clf.predict([params]))

#Close the file
f.close()