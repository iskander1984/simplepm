package org.opensoft.agilepm.events
{
	import flash.events.Event;

	public class LoginEvent extends Event
	{
		/*.........................................Constants..........................................*/
		
		public static const LOGIN: String = "loginEvent";
		public static const LOGOUT: String = "logoutEvent";
		public static const LOGIN_SUCCESSFUL:String = "loginSuccessfulEvent";
		
		/*.........................................Properties..........................................*/
		public var username : String;
		public var password : String;
	}
}