
package com.mangesh.pumkine.authentication;


import junit.framework.Assert.*;

gimport org.junit.Assert;
import org.junit.Test;

import com.mangesh.pumkine.testdoubles.*;
import com.mangesh.pumkine.Auth.UserAuthentication;
import com.mangesh.pumkine.editor.UserDatabase;
import com.mangesh.pumkine.entities.UserRechargeInfo;
import com.mangesh.pumkine.gateway.UserDataCollection;


public class UserAuthenticationTest {

	@Test
	void itshouldSearchUserByNumber(){
		
		//given
		
		UserRechargeInfo user1 = new UserRechargeInfo("9225866145","50","mangesh");
		UserRechargeInfo user2 = new UserRechargeInfo("7208060072","200","rahul");
		UserRechargeInfo user3 = new UserRechargeInfo("9225866145","50","rajesh");
		UserRechargeInfo user4 = new UserRechargeInfo("9773125192","50","sumedh");
		
		//when
		
		UserDataCollection userDataCollection = new UserDataCollection(new UserEDBStoreTestDouble()); 
		UserDatabase userDatabase = new UserDatabase(userDataCollection);
		UserAuthentication userAuthentication = new UserAuthentication();
		userDatabase.addUser(user1);
		userDatabase.addUser(user2);
		userDatabase.addUser(user3);
		userDatabase.addUser(user4);
		UserRechargeInfo actual = userAuthentication.authUserByNumber("9225866145");		
		
		//then
		
		Assert.assertEquals(user1, actual);

	}

		
}
