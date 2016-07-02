<jsp:include page="header.jsp" />
<article style="width: 90%;">
    <div  style="text-align: center;margin-top: 30px;">   
        </head>
        <body>
            <div class="text_ text_border size_text topOfBox">${msg}</div>
            <form method="post" action="<%=request.getContextPath() + "/controller?action=sportsdetails"%>">
                <br><br><br><br><br> 
                <button type="submit" class="btn btn-success" style="width: 25%; margin-left: auto;margin-right: auto;">BOOK A COURT TO PLAY</button>  
            </form>
            </form>
            <div  style="text-align: center;margin-top: 30px;">                
                <form method="post" action="<%=request.getContextPath() + "/controller?action=map"%>">
                    <button type="submit" class="btn btn-success" style="width: 25%; margin-left: auto;margin-right: auto;">PARKING LOCATION</button>  
                </form>
            </div>

            <div  style="text-align: center;margin-top: 30px;"> 
                <form method="post" action="<%=request.getContextPath() + "/controller?action=EquipmentInfo"%>">
                    <button type="submit" class="btn btn-success" style="width: 25%; margin-left: auto;margin-right: auto;"> RENT A SPORTS EQUIPMENT</button>  
                </form>
            </div>
            <div  style="text-align: center;margin-top: 30px;">                
                <p></p>

            </div>

            </article>
        </body>
