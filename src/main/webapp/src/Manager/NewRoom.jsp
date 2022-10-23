<jsp:include page="../components/sideBar.jsp"/>
<%--------------------------------------Section--------------------------%>
<div class="overflow-auto h-screen pt-2 pr-2 pl-2 md:pt-0 md:pr-0 md:pl-0">
    <h1 class="py-4 px-4 text-2xl font-semibold"> Add new room </h1>
<div class="flex flex-col px-4 py-8 bg-white rounded-lg shadow white:bg-gray-800 sm:px-6 md:px-8 lg:px-10">

    <div class="p-6 mt-8">
        <form action="#">
            <div class="flex flex-col mb-4">
                <div class=" relative ">
                    <input type="text" id="create-account-pseudo" class=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" name="num" placeholder="Description"/>
                </div>
            </div>
            <div class="flex gap-4 mb-4">
                <div class=" relative ">
                    <input type="number"  min="1" id="create-account-first-name" class=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" name="First name" placeholder="Num"/>
                </div>
                <div class=" relative ">
                    <input type="number" min="1" id="create-account-last-name" class=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" name="Last name" placeholder="Price"/>
                </div>
            </div>

            <div class="flex gap-4 mb-4">
                <select
                        class="rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent"
                        name="choice-button"
                        id="choice-button"
                        placeholder="Type room"
                >
                    <option defaultValue="single room" selected>single room</option>
                    <option defaultValue="double room">double room</option>
                    <option defaultValue="triple room">triple room</option>
                    <option defaultValue="suit">suit</option>
                </select>
            </div>

            <div class="flex gap-4 mb-4">
                <div class=" relative ">
                    <input type="text"  class=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" name="First name" placeholder="Status"/>
                </div>

            </div>

            <div class="flex gap-4 mb-4">
                <div class=" relative ">
                    <label class="block">
                        <span class="sr-only">Choose File</span>
                        <input type="file" multiple="multiple" class="block w-full text-sm text-gray-500 file:mr-4 file:py-2 file:px-4 file:rounded-full file:border-0 file:text-sm file:font-semibold file:bg-blue-50 file:text-blue-700 hover:file:bg-blue-100"/>
                    </label>
                </div>

            </div>
            <div class="flex w-full my-8">
                <button type="submit" class="py-2 px-4 bg-blue-500 hover:bg-blue-700 text-white text-center text-base font-semibold shadow-md focus:outline-none rounded-lg ">
                    Add
                </button>
            </div>
        </form>

    </div>
</div>

<%------------------------------------ End section -------------------------------%>
</div>
</div>

</main>

</body>
</html>
