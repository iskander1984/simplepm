package org.opensoft.agilepm.domain
{
	
	[RemoteClass(alias="org.opensoft.agilepm.domain.Iteration")]
	public class Iteration
	{
		public var id:*;
		public var version:*;
		public var name:String;
		public var description:String;
		public var startDate:Date;
		public var endDate:Date;
		public var state:int;
		public var project:Project;
	}
}