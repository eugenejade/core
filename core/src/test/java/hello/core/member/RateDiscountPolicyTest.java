package hello.core.member;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;

class RateDiscountPolicyTest {

	RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
	
	@Test
	@DisplayName("vip는 10프로 할인이 적용되어야한다")
	void vipp_o() {
		//given
		Member member = new Member(1L, "memberVIP", Grade.VIP);
		//when
		int discount = discountPolicy.discount(member, 10000);
		//then
		Assertions.assertThat(discount).isEqualTo(1000);
	}
	
	@Test
	@DisplayName("vip아니면 할인이 적용되지 않아야한다")
	void vip_x() {
		//given
		Member member = new Member(2L, "memberBASIC", Grade.BASIC);
		//when
		int discount = discountPolicy.discount(member, 10000);
		//then
		Assertions.assertThat(discount).isEqualTo(1000);
	}

}
