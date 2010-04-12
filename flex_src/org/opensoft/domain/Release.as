package org.opensoft.agilepm.domain
{
	[RemoteClass(alias="org.opensoft.agilepm.domain.Release")]
	public class Release
	{
		public var id:*;
		public var version:*;
		public var name:String;
		public var description:String;
		public var startDate:Date;
		public var endDate:Date; 
	}
}