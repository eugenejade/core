package hello.core.member;

public class MemberServiceImpl implements MemberService {
	
	private final MemberRepository memberRepository;
	
	public MemberServiceImpl(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;  //할당
	}

	@Override
	public void join(Member member) {
		memberRepository.save(member);
		
	}

	@Override
	public Member finMember(Long memberId) {
		// TODO Auto-generated method stub
		return memberRepository.findById(memberId);
	}
	
}
