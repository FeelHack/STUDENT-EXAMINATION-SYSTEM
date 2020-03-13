<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/index.css">
    <style>
      /* About Section Css Start */
.about-section {
    padding: 50px;
    text-align: center;
    background-color: #474e5d;
    color: white;
  }
  /* About Section Css End */
  /* Social Icon Section */
  
  .fa {
    padding: 20px;
    font-size: 15px;
    width: 30px;
    text-align: center;
    text-decoration: none;
    margin: 2px 2px;
    border-radius: 60%;
  }
  
  .fa:hover {
      opacity: 0.5;
  }
  
  .fa-facebook {
    background: #3B5998;
    color: white;
  }
  .fa-linkedin {
    background: #007bb5;
    color: white;
  }
  
  .fa-youtube {
    background: #bb0000;
    color: white;
  }
  
  .fa-instagram {
    background: #125688;
    color: white;
  }
    </style>
</head>
<body>
       
     <jsp:include page="indexHeader.jsp"></jsp:include>

<!-- About Me Section Start -->
       
<div class="about-section">
    <h1>About Me</h1>
    <p>"Life Is Not About Enjoy Things , It Is All About How To Servipe</p>
    <p>I am Fresher B.tech Student Currently Doing 
        Nothing Just Spent My Time To Increase Age
    </p>
    <a href="#" class="fa fa-facebook"></a>
    <a href="#" class="fa fa-linkedin"></a>
    <a href="#" class="fa fa-youtube"></a>
    <a href="#" class="fa fa-instagram"></a>
  </div>
    
<!-- About Me Section End -->


  <jsp:include page="indexFooter.jsp"></jsp:include>
    
</body>
</html>