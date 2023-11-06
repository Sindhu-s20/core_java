class JobStarter{
	public static void main(String args[])
		{

		Job job=new Job();
		Company company=new Company(job);
		company.showInfo();
		}
}
