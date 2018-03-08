package killoffer;
import java.util.Stack;
public class isPopOrder {
	/* ���������飬pushA�Ǳ�ʾѹ��ջ��˳��popA��ʾ��ջ��˳��
	 * �ж�popA��pushA��ջ˳���Ƿ������
	 * ˼·����һ��ջstack1���Ƚ�pushA���������ѹ��ջstack1��
	 * ջstack1�Ķ�������peek()��popA�е����ݱȽϡ�
	 * ����˵����popindex�ǿ��ƱȽ�λ�õı�������popA�ĵ�һλpopindex = 0�Ƚϡ�
	 * �����ȣ���ջ stack1����pop�������������ȣ�������pushA�е�����ѹ��ջstack1��
	 * �����pushA����һ����ȫѹ��ջ�ڡ��ж�ջstack1�Ƿ�Ϊ�վ����ж�popA�Ƿ�ΪpushA��
	 * ��ջ˳����Ϊ���popAΪ��ջ˳�������ж�ջ�������ⲽ��stack1���������ֱ��Ϊ�ա�
	 * �����Ϊ��ջ˳����ջstack1�����꣬popindex!=popA.length-1��ջ�Ͳ�Ϊ�ա�
	 */
	private Stack<Integer> stack1 = new Stack<Integer>();
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int popindex = 0; 
        for(int i = 0;i<pushA.length;i++){
        stack1.push(pushA[i]);
        while(!stack1.isEmpty()&&stack1.peek() == popA[popindex]){
                stack1.pop();
                popindex++;
            }
        }
        return stack1.isEmpty();
        
    }
}
