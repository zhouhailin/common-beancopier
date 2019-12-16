package link.thingscloud.common.beancopier;

/**
 * @author : zhouhailin
 */
public interface BeanCopier<S, T> {

    /**
     * copy source to new target
     *
     * @param source source object
     * @return target object
     */
    T copy(S source);

    /**
     * copy source to exist target
     *
     * @param source source object
     * @param target exist target object
     * @return target object
     */
    T copy(S source, T target);

    default <V1, V2> T copy(S source, T target, BeanCopierResolver<V1, V2> beanCopierResolver) {
        return copy(source, target);
    }

    default <V1, V2> BeanCopier<S, T> register(BeanCopierResolver<V1, V2> beanCopierResolver) {
        return this;
    }

}
