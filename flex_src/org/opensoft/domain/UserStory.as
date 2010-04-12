package org.opensoft.agilepm.domain
{
	[RemoteClass(alias="org.opensoft.agilepm.domain.UserStory")]
	public class UserStory
	{
		public var id:*;
		public var version:*;
		public var name:String;
		public var description:String;
		public var state:int;
		public var owner:User;
	}
}