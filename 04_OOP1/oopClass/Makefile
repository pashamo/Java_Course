JR = time java
JCC = javac
JFLAGS = -g

default: Car.class oopClass.class #codingExercise29.class

Car.class: Car.java
	$(JCC) $(JFLAGS) Car.java
oopClass.class: oopClass.java Car.class
	$(JCC) $(JFLAGS) oopClass.java
	$(JR) oopClass
#codingExercise29.class: codingExercise29.java
#	$(JCC) $(JFLAGS) codingExercise29.java
#	$(JR) codingExercise29


clean:
	$(RM) *.class
