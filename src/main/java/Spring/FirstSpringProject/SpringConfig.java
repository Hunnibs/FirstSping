package Spring.FirstSpringProject;

import Spring.FirstSpringProject.repository.MemberRepository;
import Spring.FirstSpringProject.repository.MemoryMemberRepository;
import Spring.FirstSpringProject.service.MemberService;
import org.springframework.context.annotation.Bean;

public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService();
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
