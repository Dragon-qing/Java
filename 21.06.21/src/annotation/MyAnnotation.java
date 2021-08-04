package annotation;

public @interface MyAnnotation{
    int value();
    String name()default "wmx";
}
