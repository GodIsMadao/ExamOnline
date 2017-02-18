package zjut.sy.test.util;

import java.util.List;

import junit.framework.Assert;

import zjut.sy.model.Student;


public class EntitiesHelper {
	private static Student baseStudent = new Student(1,"student1","111","zhangsan1","111110","aaaaaa","浙工大","111@qq.com",1,"D:");

	public static Student getBaseStudent() {
		return baseStudent;
	}

	public static void assertStudent(Student expected,Student actual) {
		Assert.assertNotNull(expected);
		Assert.assertEquals(expected.getId(), actual.getId());
		Assert.assertEquals(expected.getUsername(), actual.getUsername());
		Assert.assertEquals(expected.getRealname(), actual.getRealname());
		Assert.assertEquals(expected.getPassword(), actual.getPassword());
		Assert.assertEquals(expected.getAddress(), actual.getAddress());
		Assert.assertEquals(expected.getStatus(), actual.getStatus());
		Assert.assertEquals(expected.getEmail(), actual.getEmail());
	}

	public static void assertObjects(List<?> expected,List<?> actuals) {
		for(int i=0;i<expected.size();i++) {
			Object eo = expected.get(i);
			Object ao = actuals.get(i);
			Assert.assertEquals(eo, ao);
		}
	}

	public static void assertStudent(List<Student> expected,List<Student> actuals) {
		for(int i=0;i<expected.size();i++) {
			Student eu = expected.get(i);
			Student au = actuals.get(i);
			assertStudent(eu, au);
		}
	}

//	public static void assertRole(Role expected,Role actual) {
//		Assert.assertNotNull(expected);
//		Assert.assertEquals(expected.getId(), actual.getId());
//		Assert.assertEquals(expected.getName(), actual.getName());
//		Assert.assertEquals(expected.getRoleType(), actual.getRoleType());
//	}
//
//	public static void assertRoles(List<Role> expected,List<Role> actuals) {
//		for(int i=0;i<expected.size();i++) {
//			Role er = expected.get(i);
//			Role ar = actuals.get(i);
//			assertRole(er, ar);
//		}
//	}
//
//	public static void assertGroup(Group expected,Group actual) {
//		Assert.assertNotNull(expected);
//		Assert.assertEquals(expected.getId(), actual.getId());
//		Assert.assertEquals(expected.getName(), actual.getName());
//	}
//
//	public static void assertGroups(List<Group> expected,List<Group> actuals) {
//		for(int i=0;i<expected.size();i++) {
//			Group er = expected.get(i);
//			Group ar = actuals.get(i);
//			assertGroup(er, ar);
//		}
//	}
//
//	public static void assertChannel(Channel expected,Channel actual) throws Exception{
//		TestUtil.assertObjByClz(expected, actual, Channel.class, new String[]{"parent"});
//	}

	public static void assertStudent(Student expected) {
		assertStudent(expected, baseStudent);
	}
}
