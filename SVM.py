import sys
from sklearn import svm
from sklearn.metrics import accuracy_score
from sklearn.model_selection import train_test_split
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
    if isIce == "1":
        factors.append(float(line[0]))
    if isRain == "1":
        factors.append(float(line[1]))
    if isWind == "1":
        factors.append(float(line[2]))
    if isDry == "1":
        factors.append(float(line[3]))
    if isSnow == "1":
        factors.append(float(line[4]))
    if isCold == "1":
        factors.append(float(line[5]))

    X.append(factors)
    y.append(float(line[6]))

#Create the SVM
clf = svm.SVC()

#Code used to determine accuracy of SVM
#Results show that the SVM is 99% accurate when the data is split into a testing and training set
    #attribute_train, attribute_test, label_train, label_test = train_test_split(X, y, test_size=0.25, train_size=0.75, random_state=23)
    #clf.fit(attribute_train, label_train)
    #predictions = clf.predict(attribute_test)
    #print(accuracy_score(label_test, predictions))

    #type_one_error = 0
    #type_two_error = 0
    #dangerous      = 0
    #safe           = 0

    #for i in range(len(predictions)):
    #    if predictions[i] != label_test[i]:
    #        if predictions[i] == 0:
    #            type_two_error += 1
    #        elif predictions[i] == 1:
    #            type_one_error += 1
    #    else:
    #        if predictions[i] == 0:
    #            safe += 1
    #        else:
    #            dangerous += 1

    #print ("\nNumber of true positives:", dangerous)
    #print ("Percentage of true positives", (float(dangerous)/len(label_test)) * 100, "%")
    #print ("\nNumber of true negatives:", safe)
    #print ("Percentage of true negatives:", (float(safe)/len(label_test)) * 100, "%")
    #print ("\nNumber of type one errors:", type_one_error)
    #print ("Percentage of type one errors:", (float(type_one_error) / len(label_test)) * 100, "%")
    #print ("\nNumber of type two errors:", type_two_error)
    #print ("Percentage of type two errors:", (float(type_two_error) / len(label_test)) * 100, "%")

#Train the SVM
clf.fit(X, y)

#Determine which parameters to feed to the SVM
if isIce  == "1":
    params.append(param0)
if isRain == "1":
    params.append(param1)
if isWind == "1":
    params.append(param2)
if isDry == "1":
    params.append(param3)
if isSnow == "1":
    params.append(param4)
if isCold == "1":
    params.append(param5)

#Use the SVM to generate a prediction, and print it to the console
print(clf.predict([params]))

#Close the file
f.close()