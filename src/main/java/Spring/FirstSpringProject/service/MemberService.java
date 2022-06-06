package Spring.FirstSpringProject.service;

import Spring.FirstSpringProject.Domain.Member;
import Spring.FirstSpringProject.repository.MemberRepository;
import Spring.FirstSpringProject.repository.MemoryMemberRepository;

public class MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    public Long join(Member member){
        validateDuplicateMember(member);  // 중복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }

}
