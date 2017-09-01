#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};

#end
import org.aspectj.lang.annotation.Aspect;

#parse("Java Header.java")
@Aspect
public class ${NAME} {
}
