package Spring.FirstSpringProject;

import Spring.FirstSpringProject.repository.MemberRepository;
import Spring.FirstSpringProject.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    // private final DataSource dataSource;
    // private final EntityManager em;
    private final MemberRepository memberRepository;
    /*
    @Autowired
    public SpringConfig(DataSource dataSource, EntityManager em){
        this.dataSource = dataSource;
        this.em = em;
    }
     */
    public SpringConfig(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }
/*
    @Bean
    public MemberRepository memberRepository(){
        // return new MemberRepository();
        // return new JdbcMemberRepository(dataSource);
        // return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }
 */
}
