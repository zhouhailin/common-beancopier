package link.thingscloud.common.beancopier;

/**
 * @author : zhouhailin
 */
public class BeanCopiers {

    private BeanCopiers() {
    }

    public static <S, T> BeanCopier<S, T> newCopier() {
        return new BeanCopier<S, T>() {
            @Override
            public T copy(S source) {
                return null;
            }

            @Override
            public T copy(S source, T target) {
                return null;
            }
        };
    }
}
