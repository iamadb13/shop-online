$(function() {
	//solving menu problem active
	switch(menu) {
		
	case 'About':
		$('#about').addClass('active');
	break;
	
	case 'Contact':
		$('#contact').addClass('active');
	break;
	
	default:
		$('#home').addClass('active');
		$('#a_'+menu).addClass('active');
	break;
	
	}
});