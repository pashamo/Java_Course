JR = java
JCC = javac
JFLAGS = -g

default: keywords.class statements.class codeBlocks.class methods.class


keywords.class: keywords.java
	$(JCC) $(JFLAGS) keywords.java
	$(JR) keywords
statements.class: statements.java
	$(JCC) $(JFLAGS) statements.java
	$(JR) statements
codeBlocks.class: codeBlocks.java
	$(JCC) $(JFLAGS) codeBlocks.java
	$(JR) codeBlocks
methods.class: methods.java
	$(JCC) $(JFLAGS) methods.java
	$(JR) methods

clean:
	$(RM) *.class
