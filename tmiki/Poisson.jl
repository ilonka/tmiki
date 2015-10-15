function poisson(lambda,ilosc)
       i=0
        while i<ilosc

        X=-1
        S=1
        q=exp(-lambda)

        while S>q
               U=rand()
               S=S*U
               X=X+1
        end
        print(X)
        i=i+1
        print(" ")
  end
end

poisson(40,50)
