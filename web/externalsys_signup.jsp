<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
        body {font-family: Calibri, sans-serif; background: #EAEAEA}
        h1   {color: white; background-color: #F14141;}
    </style>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            * {
                box-sizing: border-box;
            }

            .columns {
                float: left;
                width: 33.3%;
                padding: 8px;
            }

            .price {
                list-style-type: none;
                border: 1px solid #eee;
                margin: 0;
                padding: 0;
                -webkit-transition: 0.3s;
                transition: 0.3s;
            }

            .price:hover {
                box-shadow: 0 8px 12px 0 rgba(0,0,0,0.2)
            }

            .price .header {
                background-color: #111;
                color: white;
                font-size: 25px;
            }

            .price li {
                border-bottom: 1px solid #eee;
                padding: 20px;
                text-align: center;
            }

            .price .grey {
                background-color: #eee;
                font-size: 20px;
            }

            .button {
                background-color: #4CAF50;
                border: none;
                color: white;
                padding: 10px 25px;
                text-align: center;
                text-decoration: none;
                font-size: 18px;
            }

            @media only screen and (max-width: 600px) {
                .columns {
                    width: 100%;
                }
            }
            body {font-family: Calibri, sans-serif; background: #EAEAEA}
            h1   {color: white; background-color: #F14141;}
        </style>
    </head>
    <body>
        <form action="addToDb.jsp">
    <center> 
        <table cellspacing="20">
            <tbody>

                <tr>
                    <td><b>Username/Organization:</b> </td>
                    <td><input id="firstName" type="text" name="user" value="" placeholder="Username or Organization"  /></td>
                </tr>
            <br/><br/>

            <tr>
                <td><b>Password</b> </td>
                <td><input type="password" name="pass" value="" placeholder="Enter Password"/></td>
            </tr>
            <tr>
                <td><b>Confirm Password</b> </td>
                <td><input type="password" name="pass" value="" placeholder="Re-Type Password" /></td>
            </tr>

            </tbody>
        </table>

        <h2 style="text-align:center">Pricing Packages</h2>

      
            
        <div class="columns">
            <ul class="price">
                <li class="header">Basic</li>
                <li class="grey">$50 / year</li>
                <li>Sugar Level</li>
                <li>Heart Rate</li>
                <li>Blood Group</li>

                <li class="grey">
                    <input type="radio" name="time" value="Basic"/></td></li>
                    
            </ul>
        </div>

        <div class="columns">
            <ul class="price">
                <li class="header" style="background-color:#4CAF50">Professional</li>
                <li class="grey">$ 100/ year</li>
                <li>Sugar Level</li>
                <li>Heart Rate</li>
                <li>Blood Group</li>
                <li>Blood Pressure</li>
                <li class="grey">
                    <input type="radio" name="time" value="Professional"/></li>
                    
            </ul>
        </div>

        <div class="columns">
            <ul class="price">
                <li class="header">Premium</li>
                <li class="grey">$ 150 / year</li>
                <li>Sugar Level</li>
                <li>Heart Rate</li>
                <li>Blood Group</li>
                <li>Blood Pressure</li>
                <li>Haemoglobin</li>
                <li>Family History</li>
                <li class="grey">
                    <input type="radio" name="time"value="Premium"/></li>
                    
            </ul>
        </div>
        <input type="submit" value="Sign Up" />
    </center>
</form>
    </body>
</html>