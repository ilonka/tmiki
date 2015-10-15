function bernoulli(p,N,ilosc)
       i=0
        while i<ilosc

        X=0

  	   for k= 0:N
		U=rand()
		if U<=p
			X=X+1

		end

           end
        print(X)
        i=i+1
	print(" ")
  end
end

bernoulli(0.6,61,1000)
