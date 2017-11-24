$(function() {

  //指定したフォームが入力される度に実行する
  $('[name="number"]').on('keydown keyup keypress change',function(){
  //入力された文字数を取得して変数countに代入
  var count = $(this).val().length;
  $('#text1').text(count);
  //入力された内容を取得して変数contentに代入
  var content = $('[name="number"]').val();
  $('#text2').text(content);
  });

  $('#login-show').click(function() {
    $('#login-modal').fadeIn();
  });

  $('.signup-show').click(function() {
    $('#signup-modal').fadeIn();
  });

  $('.close-modal').click(function() {
    $('#login-modal').fadeOut();
    $('#signup-modal').fadeOut();
  });

  $('.lesson-hover').hover(
    function() {
      $(this).find('.text-contents').addClass('text-active');
    },
    function() {
      $(this).find('.text-contents').removeClass('text-active');
    }
  );

  $('.faq-list-item').click(function() {
    var $answer = $(this).find('.answer');
    if($answer.hasClass('open')) {
      $answer.removeClass('open');
      $answer.slideUp();
      $(this).find('span').text('+');
    } else {
      $answer.addClass('open');
      $answer.slideDown();
      $(this).find('span').text('-');
    }
  });
});
