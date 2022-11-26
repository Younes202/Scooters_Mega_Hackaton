<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title> Formulaire  </title>
	<style type="text/css"><%@include file = "/WEB-INF/Css/Style.css" %></style>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1" />   </head>
<body>
  <div class="container">
    <div class="title">Formulaire</div>
    <div class="content">
      <form action="#">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Full Name</span>
            <input type="text" name="Fullname" placeholder="Enter your name" required>
          </div>
          <div class="input-box">
            <span class="details">Username</span>
            <input type="text" placeholder="Enter your username" name ="Username" required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="text" placeholder="Enter your email" name="Email"required>
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="text" placeholder="Enter your number" name="Phone" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="text" placeholder="Enter your password" name="Password" required>
          </div>
          <div class="input-box">
            <span class="details">Confirm Password</span>
            <input type="text" placeholder="Confirm your password" name="Confirmpassword" required>
          </div>
          <div class="input-box">
            <span class="details">adresse</span>
            <input type="text" placeholder="Enter your adresse" name="Address"required>
          </div>
        </div>
        <div class="gender-details">
          <input type="radio" name="Gender" id="dot-1">
          <input type="radio" name="Gender" id="dot-2">
          <span class="gender-title">Gender</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">Male</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">Female</span>
          </label>
          </div>
        </div>
        <div class="gender-details">
          <input type="radio" name="Type" id="dot-1">
          <input type="radio" name="Type" id="dot-2">
          <span class="gender-title">Type </span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="Type">Etudiant</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="Type">Autre</span>
          </label>
          </div>
        </div>
        <div class="button">
          <input type="submit" value="Register">
        </div>
      </form>
    </div>
  </div>

</body>
</html>