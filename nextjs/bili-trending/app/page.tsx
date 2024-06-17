import { fetchData } from '../lib/api';

export default async function Home() {
  const data = await fetchData();
  return (
    <main className="flex min-h-screen flex-col items-center justify-between p-24">
      <div className="w-full max-w-md p-4 bg-white border border-gray-200 rounded-lg shadow sm:p-8 dark:bg-gray-800 dark:border-gray-700">
        <div className="flex items-center justify-between mb-4">
            <h5 className="text-xl font-bold leading-none text-gray-900 dark:text-white">📺 哔哩哔哩实时热搜榜</h5>
        </div>
        <div className="flow-root">
              <ul role="list" className="divide-y divide-gray-200 dark:divide-gray-700">
                {
                  data.map((item: any) => 
                    <li className="py-3 sm:py-4">
                      <div className="flex items-center">
                          <div className="flex-shrink-0">
                          <span className="bg-red-100 text-red-800 text-xs font-medium me-2 px-2.5 py-0.5 rounded dark:bg-red-900 dark:text-red-300">{item.position}</span>
                          </div>
                          <div className="flex-1 min-w-0 ms-4">
                              <p className="text-sm font-medium text-gray-900 truncate dark:text-white">
                                  {item.show_name}
                              </p>
                          </div>
                          <div className="inline-flex items-center text-base font-semibold text-gray-900 dark:text-white">
                          <a href={'https://search.bilibili.com/all?keyword=' + item.keyword} target="_blank" className="inline-flex items-center px-3 py-2 text-sm font-medium text-center text-white bg-blue-700 rounded-lg hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">
                              Learn more
                              <svg className="rtl:rotate-180 w-3.5 h-3.5 ms-2" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 14 10">
                                  <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M1 5h12m0 0L9 1m4 4L9 9"/>
                              </svg>
                          </a>
                          </div>
                      </div>
                    </li>
                  )
                }
              </ul>
        </div>
    </div>
    </main>
  );
}