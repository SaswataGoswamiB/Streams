import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>aList=new ArrayList<Integer>();
		aList.add(2);
		aList.add(6);
		aList.add(29);
		aList.add(31);
		
		LongSummaryStatistics laLongSummaryStatistics=aList.stream().
				collect(Collectors.summarizingLong(p->p));
		
		System.out.println(laLongSummaryStatistics);
		System.out.println("The Sum is :"+laLongSummaryStatistics.getSum());
		System.out.println("The average is :"+laLongSummaryStatistics.getAverage());
		System.out.println("The Count is : "+laLongSummaryStatistics.getCount());

	}

}
