/**
 * Date:     2018/5/1022:37
 * AUTHOR:   Administrator
 */
package com.zhou.springbootjpa.repository;

import com.zhou.springbootjpa.repository.base.CustomRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * 2018/5/10  22:37
 * created by zhoumb
 */
/*public class CustomRepositoryImpl<T ,ID extends Serializable> extends SimpleJpaRepository<T,ID> implements CustomRepository<T,ID> {


    public CustomRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    public CustomRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
    }

    @Override
    public Page<T> findByAuto(T example, Pageable pageable) {
        return findAll(byAuto(entityManager,example),pageable);
    }
}*/
