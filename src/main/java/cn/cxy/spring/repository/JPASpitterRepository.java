package cn.cxy.spring.repository;

import cn.cxy.spring.security.model.Spitter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.transaction.annotation.Transactional;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/20 22:49 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
@RepositoryDefinition(domainClass = Spitter.class,idClass = Long.class)
@Transactional
public interface JPASpitterRepository extends JpaRepository<Spitter,Long> {

//    @PersistenceUnit
//    private EntityManagerFactory entityManagerFactory;

    Spitter findById(Long id);


}
