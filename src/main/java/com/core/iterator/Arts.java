package com.core.iterator;

public class Arts implements ISubject {

	private String[] subjects;

	public Arts() {
		subjects = new String[2];
		subjects[0] = "English";
		subjects[1] = "Spanish";
	}

	@Override
	public IIterator CreateIterator() {
		// TODO Auto-generated method stub
		return new ArtsIterator(subjects);
	}

	public class ArtsIterator implements IIterator {

		private String[] subjects;
		private int position;

		public ArtsIterator(String[] subjects) {
			this.subjects = subjects;
			position = 0;
		}

		@Override
		public void First() {
			position = 0;

		}

		@Override
		public String Next() {
			// TODO Auto-generated method stub
			return subjects[position++];
		}

		@Override
		public Boolean IsDone() {
			// TODO Auto-generated method stub
			return position >= subjects.length;
		}

		@Override
		public String CurrentItem() {
			// TODO Auto-generated method stub
			return subjects[position];
		}

	}

}
