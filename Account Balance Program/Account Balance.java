function u = ypoloipologariasmou (input0, input1)

  for i = 1:10
      if(i==1)
          u= 5000 + 5000*0.02;
      elseif(i>=2 && i<=6)
          u= (u+input0) + 0.02*(u+input0);
      elseif(i==7) 
          u= (u-input1) + 0.02*(u-input1);
      else
          u= (u+input0) + 0.02*(u+input0);
      endif
text = [num2str(i) " xronia: " num2str(u) " euro"]; 
disp(text); 
  endfor
endfunction
ypoloipologariasmou(1000, 9000);