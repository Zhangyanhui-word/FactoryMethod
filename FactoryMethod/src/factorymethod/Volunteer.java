package factorymethod;

public class Volunteer extends LeiFeng {

	@Override
	public void Sweep() {
		// TODO Auto-generated method stub
		System.out.print("����־Ը�߰�æ��ɨ����");
		
	}

	@Override
	public void Wash() {
		// TODO Auto-generated method stub
		System.out.print("����־Ը�߰�æϴ�·�");
	}

	@Override
	public void BuyRice() {
		// TODO Auto-generated method stub
		System.out.println("����־Ը�߰�æ����");
	}

}
 //ѧ�׷�Ĵ�ѧ��
class Undergraduate extends LeiFeng{

	@Override
	public void Sweep() {
		// TODO Auto-generated method stub
		System.out.println("����־Ը�߰�æ��ɨ����");
	}

	@Override
	public void Wash() {
		// TODO Auto-generated method stub
		System.out.println("����־Ը�߰�ϴ�·�");
	}

	@Override
	public void BuyRice() {
		// TODO Auto-generated method stub
		System.out.println("����־Ը�߰�æ����");
	}
	
}
