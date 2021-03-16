package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class repositoryTest {

    @Test
    public void validate(){
        MemoryMemberRepository repository1 = new MemoryMemberRepository();
        MemoryMemberRepository repository2 = new MemoryMemberRepository();
        //given
        Member member = new Member();
        member.setName("spring");
        //when
        repository1.save(member);
        //then
        Member result = repository2.findById(member.getId()).get();
        System.out.println("result.getName() = " + result.getName());
        //assertThat(result).isEqualTo(member);
    }
}
