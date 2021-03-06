package OCJPChap10;

public class _5 {

}
/*
5. If three versions of MyClass.class exist on a file system:
Version 1 is in /foo/bar
Version 2 is in /foo/bar/baz
Version 3 is in /foo/bar/baz/bing
And the system's classpath includes
/foo/bar/baz
And this command line is invoked from /foo
java -classpath /foo/bar/baz/bing:/foo/bar MyClass

Which version will be used by java?
A. /foo/MyClass.class
B. /foo/bar/MyClass.class
C. /foo/bar/baz/MyClass.class
D. /foo/bar/baz/bing/MyClass.class
E. The result is not predictable.

Answer:
D is correct. A -classpath included with a java invocation overrides a system classpath
When java is using any classpath, it reads the classpath from left to right, and uses the
first match it finds. */