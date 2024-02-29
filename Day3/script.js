const express = require('express')
const app = express()
app.use(function(req,res,next){           //ye humara MIDDLEWARE hai 
  console.log("middleware working");
  next();
})
app.use(function(req,res,next){           // MIDDLEWARE clhai
  console.log("middleware 2 working");
  next();
})
app.get('/', function (req, res) {          // ye humara Default ROUTE hai
  res.send('Hello World')
})
app.get('/profile',function(req,res){       // ye bhi ROUTE hai
  res.send('hello from profile')
})
app.get('/profile/:username',function(req,res){       // ye Dynamic routing hai
  res.send(`hello from profile ${req.params.username}`);
})

app.listen(3000); 
