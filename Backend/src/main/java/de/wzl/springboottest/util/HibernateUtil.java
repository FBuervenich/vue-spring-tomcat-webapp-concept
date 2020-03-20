//package de.wzl.springboottest.util;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
///**
// * provides the Hibernate SessionFactory for usage in servlets
// */
//public class HibernateUtil {
//    
//    /**
//     * The main contract here is the creation of Session instances. Usually an
//     * application has a single SessionFactory instance and threads servicing
//     * client requests obtain Session instances from this factory.
//     *
//     * The internal state of a SessionFactory is immutable. Once it is created
//     * this internal state is set. This internal state includes all of the
//     * metadata about Object/Relational Mapping.
//     */
//    private final static SessionFactory SESSION_FACTORY = new Configuration()
//            .configure()
//            .buildSessionFactory();
//
//    /**
//     * returns a static sessionFactory for the application
//     *
//     * @return Hibernate SessionFactory
//     */
//    
//    public static SessionFactory getSessionFactory() {
//        return SESSION_FACTORY;
//}
//
//    /**
//     * Destroy this SessionFactory and release all resources (caches, connection
//     * pools, etc).
//     *
//     * It is the responsibility of the application to ensure that there are no
//     * open sessions before calling this method as the impact on those sessions
//     * is indeterminate.
//     */
//    public static void shutdown() {
//        getSessionFactory().close();
//    }
//
//}
