JR = time java
JCC = javac
JFLAGS = -g

default: oopClass.class #codingExercise29.class

oopClass.class: oopClass.java
	$(JCC) $(JFLAGS) oopClass.java
	$(JR) oopClass
#codingExercise29.class: codingExercise29.java
#	$(JCC) $(JFLAGS) codingExercise29.java
#	$(JR) codingExercise29


clean:
	$(RM) *.class
