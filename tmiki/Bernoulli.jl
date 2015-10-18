Pkg.add("Gadfly")
using Gadfly


function bernoulli(p,N,ilosc)
       i=1
	a = Array(Int64, ilosc-1)
        while i<ilosc

        X=0

  	   for k= 0:N
		U=rand()
		if U<=p
			X=X+1

		end

           end
       a[i] = X
        i=i+1
	# print(" ")
  end
return a
end

X = bernoulli(0.6,61,1000)
Y = [1:999]
print(X)
print(Y)
draw(SVG("output.svg", 6inch, 3inch), plot(X))
