function geometric(p,ilosc)
    i=0
    while i<ilosc
      U=rand()
      X = log(U)/log(p)
      println(X)
      i=i+1
      print(" ")
    end
end

geometric(0.2,50)
