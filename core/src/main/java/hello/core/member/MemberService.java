package hello.core.member;

public interface MemberService {

		//가입
		void join(Member member);
		
		Member finMember(Long memberId);
}
