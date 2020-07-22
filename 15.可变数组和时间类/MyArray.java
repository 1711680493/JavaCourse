
public class MyArray {

	/**
	 * ����տ�ʼ�Ĵ�СΪ 10.
	 */
	Object[] objs = new Object[10];
	
	/**
	 * ʵ���������,�տ�ʼ��ʱ��û��һ����,����Ϊ0.
	 */
	int num = 0;
	
	/**
	 * ���鳬����Сʱ,���ӵĴ�С.
	 */
	int newLength = 5;
	
	/**
	 * ��ӽ�����ķ���
	 */
	public void add(Object obj) {
		// ����������ĳ������½�һ������,������
		if (num == objs.length) {
			// ԭ����ŵ���һ�������ﱣ������,Ȼ��ԭ����ĳ�������,��ԭ����������.
			Object[] temp = objs;
			objs = new Object[temp.length + newLength];
			// �� temp ������ԭ����(�Ѿ����滻��������)
			// ʹ��ѭ�� һ������ֵ...(Ҳ�и���Ч�ķ���,���������ص㲻�����)
			for (int i = 0;i < temp.length;i++) {
				objs[i] = temp[i];
			}
		}
		// �������,λ��Ϊ���е����һ��
		objs[num] = obj;
		// ������ + 1
		num++;
	}

	/**
	 * ɾ��ָ����ķ���, index��������������ڵ�λ��.
	 * ����ط�Ҳ���ԼӸ�����ֵ,����ɾ��������.
	 */
	public void del(int index) {
		// ���ж��Ƿ���ָ����,����ɾ ���򲻲���
		if (index < 0 || index >= num) {
			return;
		}
		// ɾ��,ֱ�ӽ�����������ǰ��...
		// ���� - 1 ��Ϊ�˱�����ִ�������������Խ��
		int length = objs.length - 1;
		for (int i = index;i < length;i++) {
			objs[i] = objs[i + 1];	
		}
		// ������ - 1
		num--;
	}
	
	/**
	 * ����ָ����ķ���, index�ǰ� obj ���õ��ĸ�λ��(λ�ñ������)
	 */
	public void set(int index,Object obj) {
		// �ж����Ƿ������ get ������һ����,���Ը��ƹ���
		// ��ͬ����û�з���ֵ,����ֱ��return,���������벻ִ��.
		if (index < 0 || index >= num) {
			System.err.println("�����õĶ���û����");
			return;
		}
		// ֱ�ӽ�ָ��λ��ֵ��Ϊ���ݵ�ֵ
		objs[index] = obj;
	}

	/**
	 * ��ȡָ��λ�õ���,���ص���Object����,��Ϊ������Ҫ���������Դ���������...
	 * ���õľ���,�㲻֪�������ľ���������ʲô(ʹ�õ�ʱ��Ҫǿת,���Ͳ��Ի����).
	 */
	public Object get(int index) {
		// ��ȡ index λ�õ���,���������,�����Ѳ����ؿ�.
		// index С�� 0 ���� ���� ��ǰʵ�ʵ�������,�ʹ���û�������,���Ѳ����ؿ�
		if (index < 0 || index >= num) {
			// ֮ǰ����ʹ�õĶ��� System.out... err����������(��ɫ�Ǻ�ɫ��)
			System.err.println("���ȡ�Ķ���û����,���㷵�ؿ�");
			// ���غ�Ͳ���ִ������Ĵ�����,���һ�ȡ����ֵΪ null
			return null;
		}
		// ֱ�ӷ���.
		return objs[index];
	}
	
	/**
	 * ��ȡ��ǰ��Ч��С.
	 */
	public int getSize() {
		return num;
	}
}
