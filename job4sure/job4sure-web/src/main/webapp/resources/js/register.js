
	$(document).ready(function(){	
		$('input[name=rollType]').click(function() {
			if($(this).val() == "0") {
				$('#companyname').hide();
				$('#username').show();
				$('#companyemail').hide();
				$('#useremail').show();
				$('#Companyurl').hide();
				$('#urllabel').hide();
			} else {
				$('#username').hide();
				$('#companyname').show();
				$('#useremail').hide();
				$('#companyemail').show();
				$('#Companyurl').show();
				$('#urllabel').show();
			
			}
		});
	});
