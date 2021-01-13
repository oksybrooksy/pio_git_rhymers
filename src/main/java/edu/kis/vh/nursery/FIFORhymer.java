package edu.kis.vh.nursery;

/**
 * The type Fifo rhymer.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
		{
			countIn(temp.countOut());
		}

		return ret;
	}
}
//kombinacjaq klawiszy alt + -> i alt + <- przenosi nas między otwartymi plikami
