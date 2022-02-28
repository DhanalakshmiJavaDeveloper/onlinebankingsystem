<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>view</title>
        <link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet" >
<style>
         body{
                background-color: pink;
            }
        </style>
    </head>
<body>
        <div class="container">
            <div class="row">
                <div>
                    <form action="index" method="POST">
                        
                        <div class="form-group">
  
                            <h2>Welcome to AxisBank</h2>
                        </div>
  
                        <div class="form-group">
                           <label>Cus Name</label>
                           <input type="text" name="pinno" class="form-control" placeholder="CusName">
                        </div>
                      
                       <div class="form-group">
                           <label>Account Number</label>
                           <input type="text" name="accno" class="form-control" placeholder="AccNo">
                        </div>
                        
                        <div class="form-group">
                           <label>Pin No</label>
                           <input type="password" name="pinno" class="form-control" placeholder="PinNo">
                        </div>
                        

                         <div class="form-group">
                           <label>Cusid</label>
                           <input type="text" name="cusid" class="form-control" placeholder="Cusid">
                        </div>

                         <div class="form-group">
                           <label>Balance</label>
                           <input type="" name="pinno" class="form-control" placeholder="Deposit">
                        </div>


                         <div class="form-group">
                             <button type="submit" class="btn btn-success">Submit</button>
                        </div>  
                    </form>  
                </div>
            </div>
        </div>
    </body>
</html> 