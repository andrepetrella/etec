var a, b, c;
a = parseInt(prompt("Número 1: "));
b = parseInt(prompt("Número 2: "));
c = parseInt(prompt("Número 3: "));

// a = 1 -- b = 1 -- c = 2
if ((a < b || a == b) && (a < c || a == c)) {
    if (b > c) {
          if (a == c) {
              alert(a + " " + c + " " + b)
          }
          else {
              alert(a + " " + c + " " + b)
          }
    }
    else if (c > b) {
          if (a == b) {
              alert(a + " " + b + " " + c)
          }
          else {
            alert(a + " " + b + " " + c)
          }
    }
    else {
          alert(a + " " + b + " " + c)
    }
}
else if ((b < a || b == a) && (b < c || b == c)) {
    if (a > c) {
          if (b == c) {
              alert(b + " " + c + " " + a)
          }
          else {
            alert(b + " " + c + " " + a)
          }
    }
    else if (a < c) {
          if (b == a) {
              alert(b + " " + a + " " + c)
          }
          else {
            alert(b + " " + a + " " + c)
          }
    }
    else {
        alert(a + " " + b + " " + c)
    }
}
else if ((c < a || c == a) && (c < b || c == b)) {
    if (a > b) {
          if (c == a) {
            alert(c + " " + b + " " + a)
          }
          else {
              alert(c + " " + b + " " + a)
          }
    }
    else if (a < b) {
          if (c == b) {
              alert(c + " " + a + " " + b)
          }
          else {
         alert(c + " " + a + " " + b)
          }
    }
    else {
        alert(a + " " + b + " " + c)
    }
}