(function($){
	var __validate = $.fn.validate;
	$.fn.examvalidate = function(opts) {
		var __rules = $.extend({
			username:{
				minlength:3,
				maxlength:20
			},
			password:{
				minlength:6,
				maxlength:12
			},
			realname:"required",
			confirmPwd:{
				equalTo:"#password"
			},
			email:"email",
			sno:"required"
		},opts?(opts.rules||{}):{});
		var __messages = $.extend({
			username:"用户名不能为空，长度在3到20个字符之间",
			password:"用户密码不能为空,长度在6到12个字符之间",
			confirmPwd:"两次输入的密码不正确",
			email:"邮件格式不正确",
			realname:"名称不能为空",
			sno:"学号不能为空"
		},opts?(opts.messages||{}):{});
		var __defaultOpts = $.extend(opts||{},{
			rules:__rules,
			messages:__messages,
			errorElement: opts?(opts.errorElement||"span"):"span",
			errorClass:opts?(opts.errorClass||"errorContainer"):"errorContainer"
		});
		$.extend($.fn.validate.prototype,__defaultOpts);
		__validate.call(this,__defaultOpts);
	}
})(jQuery)