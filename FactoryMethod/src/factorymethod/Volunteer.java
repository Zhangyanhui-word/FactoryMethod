package factorymethod;

public class Volunteer extends LeiFeng {

	@Override
	public void Sweep() {
		// TODO Auto-generated method stub
		System.out.print("社区志愿者帮忙打扫卫生");
		
	}

	@Override
	public void Wash() {
		// TODO Auto-generated method stub
		System.out.print("社区志愿者帮忙洗衣服");
	}

	@Override
	public void BuyRice() {
		// TODO Auto-generated method stub
		System.out.println("社区志愿者帮忙买米");
	}

}
 //学雷锋的大学生
class Undergraduate extends LeiFeng{

	@Override
	public void Sweep() {
		// TODO Auto-generated method stub
		System.out.println("社区志愿者帮忙打扫卫生");
	}

	@Override
	public void Wash() {
		// TODO Auto-generated method stub
		System.out.println("社区志愿者帮洗衣服");
	}

	@Override
	public void BuyRice() {
		// TODO Auto-generated method stub
		System.out.println("社区志愿者帮忙买米");
	}
	
}
